package com.ricardomendesdev.microservices.limitsservice.beans;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Limits {
    int minimum;
    int maximum;
}
