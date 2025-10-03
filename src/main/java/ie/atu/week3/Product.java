package ie.atu.week3;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank
    @Size(max = 12)
    private String ProductName;
    @Positive
    @NotNull
    private double ProductPrice;



}
