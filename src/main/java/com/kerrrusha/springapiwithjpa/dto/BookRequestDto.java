package com.kerrrusha.springapiwithjpa.dto;

import lombok.Data;

@Data
public class BookRequestDto {
    private String title;
    private Long price;
}
