package one.digitalinnovation.beerstock.exception;

public class BeerStockIsEmptyException extends Throwable {

    public BeerStockIsEmptyException(Long id) {
        super(String.format("Stock for beer with ID %s is Empty", id));
    }

}
