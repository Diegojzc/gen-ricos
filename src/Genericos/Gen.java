package Genericos;

import java.util.List;

public class Gen <E>{

    List<E> num;

    public Gen(List<E> num) {
        this.num = num;
    }

    public List<E> getNum() {
        return num;
    }

    public void setNum(List<E> num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Gen{" +
                "num=" + num +
                '}';
    }
}
