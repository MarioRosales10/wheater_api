package com.example.wheater_api;

import lombook.*;
import java.io.Serializable;;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data

public class Weather {
    private String dateTime;
    private String description;
    private String address;
    private double temperature;
    
}
