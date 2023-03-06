package com.hritik.shoutreview.service.response;
import lombok.*;

@Data
@Builder
public class ReviewResponse {

    private String review;
    private Double rating;

}