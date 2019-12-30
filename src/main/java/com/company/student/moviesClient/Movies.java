
package com.company.student.moviesClient;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"page",
"per_page",
"total",
"total_pages",
"data"
})
public class Movies {

@JsonProperty("page")
private String page;
@JsonProperty("per_page")
private Integer perPage;
@JsonProperty("total")
private Integer total;
@JsonProperty("total_pages")
private Integer totalPages;
@JsonProperty("data")
private List<MovieDetails> data = null;

@JsonProperty("page")
public String getPage() {
return page;
}

@JsonProperty("page")
public void setPage(String page) {
this.page = page;
}

@JsonProperty("per_page")
public Integer getPerPage() {
return perPage;
}

@JsonProperty("per_page")
public void setPerPage(Integer perPage) {
this.perPage = perPage;
}

@JsonProperty("total")
public Integer getTotal() {
return total;
}

@JsonProperty("total")
public void setTotal(Integer total) {
this.total = total;
}

@JsonProperty("total_pages")
public Integer getTotalPages() {
return totalPages;
}

@JsonProperty("total_pages")
public void setTotalPages(Integer totalPages) {
this.totalPages = totalPages;
}

@JsonProperty("data")
public List<MovieDetails> getData() {
return data;
}

@JsonProperty("data")
public void setData(List<MovieDetails> data) {
this.data = data;
}



}