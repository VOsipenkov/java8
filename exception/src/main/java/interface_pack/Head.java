package interface_pack;

public interface Head {
    final String name = "HEAD";

    default String getName() {
        return name;
    }
    
}
