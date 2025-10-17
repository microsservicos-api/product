package store.product;

import lombok.Builder;

@Builder
public record ProductIn(
    String name,
    float price,
    String unit
) {
    
}
