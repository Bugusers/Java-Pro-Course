package org.course.hw23.builder.components;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class GPSNavigator {
    private String route;
    public GPSNavigator() {
        this.route = "Odessa hillel school";
    }
}

