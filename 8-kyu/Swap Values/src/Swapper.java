public class Swapper {
    public Object[] arguments;

    public Swapper(final Object[] args) {
        this.arguments = args;
    }

    public void swapValues() {
        this.arguments = new Object[]{arguments[1], arguments[0]};
    }
}

