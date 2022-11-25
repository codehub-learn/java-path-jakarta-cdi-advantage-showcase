package gr.codelearn.javapathjakartacdiadvantageshowcase.domain;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Video {
    private Integer id;
    private String name;
    private Integer lengthMinutes;
    private BigDecimal sizeGb;
    private Integer year;
    private Integer views;
}
