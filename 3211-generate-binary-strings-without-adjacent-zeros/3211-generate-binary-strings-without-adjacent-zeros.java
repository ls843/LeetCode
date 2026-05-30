class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, result);
        return result;
    }

    public void generate(String current, int length, List<String> result) {
        if(current.length() == length) {
            result.add(current);
            return;
        }

        generate(current + "1", length, result);

        if(current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            generate(current + "0", length, result);
        }
    }
}