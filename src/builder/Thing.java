package builder;

public class Thing {

    private int x;
    private int y;
    private String s;
    private String t;

    private Thing() {
    } // only for use by Builder

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Thing self = new Thing();

        public Builder x(int x) {
            self.x = x;
            return this;
        }

        public Builder y(int y) {
            self.y = y;
            return this;
        }

        public Builder s(String s) {
            self.s = s;
            return this;
        }

        public Builder t(String t) {
            self.t = t;
            return this;
        }

        public Thing build() {
            self.validate();
            return self;
        }
    }

    private void validate() {
        if (x > y) {
            throw new IllegalArgumentException("x=" + x + " and y=" + y + "but requires x <= y");
        }
        if (s == null) {
            throw new IllegalArgumentException("s should not be null");
        }
        if (t == null) {
            throw new IllegalArgumentException("s should not be null");
        }
    }
}
