package com.company.student.moviesClient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Title",
"Year",
"imdbID"
})
public class MovieDetails {

@JsonProperty("Title")
private String title;
@JsonProperty("Year")
private Integer year;
@JsonProperty("imdbID")
private String imdbID;

@JsonProperty("Title")
public String getTitle() {
return title;
}

@JsonProperty("Title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("Year")
public Integer getYear() {
return year;
}

@JsonProperty("Year")
public void setYear(Integer year) {
this.year = year;
}

@JsonProperty("imdbID")
public String getImdbID() {
return imdbID;
}

@JsonProperty("imdbID")
public void setImdbID(String imdbID) {
this.imdbID = imdbID;
}



}
