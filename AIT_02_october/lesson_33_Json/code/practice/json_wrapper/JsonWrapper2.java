package practice.json_wrapper;

public class JsonWrapper2 <K> {
    private K value;

    public JsonWrapper2(K value) {
        this.value = value;
    }

    public K getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}
