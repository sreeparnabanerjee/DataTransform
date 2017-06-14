package com.cleo.data.transform;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class DataTransformRESTConfiguration extends Configuration {

  @NotEmpty
  private String driverClass;
  @NotEmpty
  private String user;
  @NotEmpty
  private String password;
  @NotEmpty
  private String url;

  @JsonProperty
  public String getDriverClass() {
    return driverClass;
  }

  @JsonProperty
  public void setDriverClass(String driverClass) {
    this.driverClass = driverClass;
  }

  @JsonProperty
  public String getUser() {
    return user;
  }

  @JsonProperty
  public void setUser(String user) {
    this.user = user;
  }

  @JsonProperty
  public String getPassword() {
    return password;
  }

  @JsonProperty
  public void setPassword(String password) {
    this.password = password;
  }

  @JsonProperty
  public String getUrl() {
    return url;
  }

  @JsonProperty
  public void setUrl(String url) {
    this.url = url;
  }

}
