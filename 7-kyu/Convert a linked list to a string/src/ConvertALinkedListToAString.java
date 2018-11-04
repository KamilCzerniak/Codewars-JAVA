public class ConvertALinkedListToAString {
    public static String stringify(Node list) {
        StringBuilder sb = new StringBuilder();
        Node p = list;
        while (p != null) {
            sb.append(p.getData()).append(" -> ");
            p = p.getNext();
        }
        sb.append(p);
        return sb.toString();
    }
}