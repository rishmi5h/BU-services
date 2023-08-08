package org.rishmi5h.exception;

public class ProductNotExistException extends IllegalArgumentException{
  public ProductNotExistException(String msg){
      super(msg);
  }
}
