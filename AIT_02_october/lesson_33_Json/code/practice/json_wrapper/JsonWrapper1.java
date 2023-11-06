
package practice.json_wrapper;
//имя: Леонид, возраст
//{name: Leonid, age: 59} - это json, который передаёт другой программе и она может его прочитать *парсинг*

class JsonWrapper1 {
    //поле класса
    private Object value;
    //конструктор


    public JsonWrapper1 (Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}
