package com.cleo.data.transform.model;

import com.cleo.data.transform.resources.VLTransferConnectorResource;
import org.glassfish.jersey.linking.InjectLink;
import org.glassfish.jersey.server.Uri;

/**
 * Created by sreeparna on 31/05/17.
 */
public class VLTransfersPOJO {
  String transferId;
  String VLSerial;
  String externalId;
  String messageId;
  String host;
  String mailbox;
  String username;
  String action;
  String transport;
  String startDt;
  String endDt;
  String direction;
  String isReceipt;
  String status;
  String originalName;
  String originalPath;
  String originalFileDt;
  int fileSize;
  float transferTime;
  int transferBytes;
  String crc;
  String resultText;
  String fileHeader;
  String folder;
  String mailboxId;
  String copyPath;
  String runType;

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public void setMailboxId(String mailboxId) {
    this.mailboxId = mailboxId;
  }

  public void setCopyPath(String copyPath) {
    this.copyPath = copyPath;
  }

  public void setRunType(String runType) {
    this.runType = runType;
  }

  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }

  public void setVLSerial(String VLSerial) {
    this.VLSerial = VLSerial;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public void setMailbox(String mailbox) {
    this.mailbox = mailbox;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public void setTransport(String transport) {
    this.transport = transport;
  }

  public void setStartDt(String startDt) {
    this.startDt = startDt;
  }

  public void setEndDt(String endDt) {
    this.endDt = endDt;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public void setIsReceipt(String isReceipt) {
    this.isReceipt = isReceipt;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }

  public void setOriginalPath(String originalPath) {
    this.originalPath = originalPath;
  }

  public void setOriginalFileDt(String originalFileDt) {
    this.originalFileDt = originalFileDt;
  }

  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }

  public void setTransferTime(float transferTime) {
    this.transferTime = transferTime;
  }

  public void setTransferBytes(int transferBytes) {
    this.transferBytes = transferBytes;
  }

  public void setCrc(String crc) {
    this.crc = crc;
  }

  public void setResultText(String resultText) {
    this.resultText = resultText;
  }

  public void setFileHeader(String fileHeader) {
    this.fileHeader = fileHeader;
  }

  public String getVLSerial() {
    return VLSerial;
  }

  public String getExternalId() {
    return externalId;
  }

  public String getMessageId() {
    return messageId;
  }

  public String getHost() {
    return host;
  }

  public String getMailbox() {
    return mailbox;
  }

  public String getUsername() {
    return username;
  }

  public String getAction() {
    return action;
  }

  public String getTransport() {
    return transport;
  }

  public String getStartDt() {
    return startDt;
  }

  public String getEndDt() {
    return endDt;
  }

  public String getDirection() {
    return direction;
  }

  public String getIsReceipt() {
    return isReceipt;
  }

  public String getStatus() {
    return status;
  }

  public String getOriginalName() {
    return originalName;
  }

  public String getOriginalPath() {
    return originalPath;
  }

  public String getOriginalFileDt() {
    return originalFileDt;
  }

  public int getFileSize() {
    return fileSize;
  }

  public float getTransferTime() {
    return transferTime;
  }

  public int getTransferBytes() {
    return transferBytes;
  }

  public String getCrc() {
    return crc;
  }

  public String getResultText() {
    return resultText;
  }

  public String getFileHeader() {
    return fileHeader;
  }

  public String getFolder() {
    return folder;
  }

  public String getMailboxId() {
    return mailboxId;
  }

  public String getCopyPath() {
    return copyPath;
  }

  public String getRunType() {
    return runType;
  }

  public String getTransferId() {
    return transferId;
  }
}
