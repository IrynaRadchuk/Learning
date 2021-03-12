package TestingCode;

import java.util.Objects;

public class EqualsHashCode {
    public int newInt;
    public float newF;
    public String newS;

    public static void main(String[] args) {
        EqualsHashCode code = new EqualsHashCode();
        EqualsHashCode codee = new EqualsHashCode();
        System.out.println(code.equals(codee));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        System.out.println(o.getClass());
        boolean b = o.getClass() != this.getClass();
        System.out.println(b);
        if (b) return false;
        EqualsHashCode equalsHashCode = (EqualsHashCode) o;
        return this.newInt == equalsHashCode.newInt &&
                Float.compare(this.newF, equalsHashCode.newF) == 0 &&
                Objects.equals(this.newS, equalsHashCode.newS);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
