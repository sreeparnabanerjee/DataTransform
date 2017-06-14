package com.cleo.data.transform.model;

import com.cleo.data.transform.resources.VLTransferConnectorResource;
import org.glassfish.jersey.linking.InjectLink;

import java.util.ArrayList;

/**
 * Created by sreeparna on 31/05/17.
 */
public class VLTransferTable {

  ArrayList<VLTransfersPOJO> vlTransfersPOJOS = new ArrayList<VLTransfersPOJO>();

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @InjectLink(resource = VLTransferConnectorResource.class, method = "readData", style = InjectLink.Style.ABSOLUTE)
  String uri;

  public ArrayList<VLTransfersPOJO> getVlTransfersPOJOS() {
    return vlTransfersPOJOS;
  }

  public void setVlTransfersPOJOS(ArrayList<VLTransfersPOJO> vlTransfersPOJOS) {
    this.vlTransfersPOJOS = vlTransfersPOJOS;
  }


}
