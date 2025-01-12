package lab8;

public interface Worker {
    default void work(){
        System.out.println("isMovingCrates");
    }
}
