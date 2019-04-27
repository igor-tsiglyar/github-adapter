package io.tsiglyar.github;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"name", "description", "url"})
public class Repository implements Serializable {

  private static final long serialVersionUID = 1L;

  private final String name;
  private final String description;
  private final String url;

  public Repository(@JsonProperty("name") String name,
                    @JsonProperty("description") String description,
                    @JsonProperty("html_url") String url) {
    this.name = name;
    this.description = description;
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public String toString() {
    try {
      return new ObjectMapper().writeValueAsString(this);
    } catch (JsonProcessingException e) {
      return null;
    }
  }

}
