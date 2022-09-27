package com.example.integerToRoman.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntegerRoman {
   // @Id
    private int id;
    private String roman;
}
