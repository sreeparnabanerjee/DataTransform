package com.cleo.data.transform.resources;

import com.cleo.data.transform.model.VLTransferTable;
import com.cleo.data.transform.model.VLTransfersPOJO;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by sreeparna on 31/05/17.
 */
@Path("/getData")
public class VLTransferConnectorResource {

  private final String jdbcDriverStr;
  private final String jdbcURL;
  private final String user;
  private final String password;


  private Connection connection;
  private Statement statement;
  private ResultSet resultSet;

  public VLTransferConnectorResource(String jdbcDriverStr, String jdbcURL, String user, String password) {
    this.jdbcDriverStr = jdbcDriverStr;
    this.jdbcURL = jdbcURL;
    this.user = user;
    this.password = password;
  }

  @GET
  @Path("/VLT")
  @Produces("application/json")
  public VLTransferTable readData() throws Exception {
    try {
      Class.forName(jdbcDriverStr);
      connection = DriverManager.getConnection(jdbcURL, user, password);
      statement = connection.createStatement();
      resultSet = statement.executeQuery("select * from VLTransfers;");
      //ArrayList<VLTransfersPOJO> vlTransferTable = getResultSet(this.resultSet);
      //return Response.ok().entity(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsBytes(getResultSet(this.resultSet))).build();
      return getResultSet(this.resultSet);
    } finally {
      close();
    }
  }

  private VLTransferTable getResultSet(ResultSet resultSet) throws Exception {
    VLTransferTable vlTransferTable = new VLTransferTable();
    while (resultSet.next()) {
      VLTransfersPOJO vlTransfersPOJO = new VLTransfersPOJO();
      vlTransfersPOJO.setTransferId(resultSet.getString(1));
      vlTransfersPOJO.setVLSerial(resultSet.getString(2));
      vlTransfersPOJO.setExternalId(resultSet.getString(3));
      vlTransfersPOJO.setMessageId(resultSet.getString(4));
      vlTransfersPOJO.setHost(resultSet.getString(5));
      vlTransfersPOJO.setMailbox(resultSet.getString(6));
      vlTransfersPOJO.setUsername(resultSet.getString(7));
      vlTransfersPOJO.setAction(resultSet.getString(8));
      vlTransfersPOJO.setTransport(resultSet.getString(9));
      vlTransfersPOJO.setStartDt(resultSet.getString(10));
      vlTransfersPOJO.setEndDt(resultSet.getString(11));
      vlTransfersPOJO.setDirection(resultSet.getString(12));
      vlTransfersPOJO.setIsReceipt(resultSet.getString(13));
      vlTransfersPOJO.setStatus(resultSet.getString(14));
      vlTransfersPOJO.setOriginalName(resultSet.getString(15));
      vlTransfersPOJO.setOriginalPath(resultSet.getString(16));
      vlTransfersPOJO.setOriginalFileDt(resultSet.getString(17));
      vlTransfersPOJO.setFileSize(resultSet.getInt(18));
      vlTransfersPOJO.setTransferTime(resultSet.getFloat(19));
      vlTransfersPOJO.setTransferBytes(resultSet.getInt(20));
      vlTransfersPOJO.setCrc(resultSet.getString(21));
      vlTransfersPOJO.setResultText(resultSet.getString(22));
      vlTransfersPOJO.setFileHeader(resultSet.getString(23));
      vlTransfersPOJO.setFolder(resultSet.getString(24));
      vlTransfersPOJO.setMailboxId(resultSet.getString(25));
      vlTransfersPOJO.setCopyPath(resultSet.getString(26));
      vlTransfersPOJO.setRunType(resultSet.getString(27));
      vlTransferTable.getVlTransfersPOJOS().add(vlTransfersPOJO);
    }
    return vlTransferTable;
  }

  private void close() {
    try {
      if (resultSet != null) resultSet.close();
      if (statement != null) statement.close();
      if (connection != null) connection.close();
    } catch (Exception e) {
    }
  }
}

