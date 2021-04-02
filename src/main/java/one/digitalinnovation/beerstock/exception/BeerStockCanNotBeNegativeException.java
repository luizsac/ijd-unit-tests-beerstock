package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockCanNotBeNegativeException extends Exception{

    public BeerStockCanNotBeNegativeException(Long id, int quantityToDecrement) {
        super(String.format("Decrement value informed for Beers with ID %s is larger than stock's current size: %s", id, quantityToDecrement));
    }

}
