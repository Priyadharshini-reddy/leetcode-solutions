

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*') {

                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);

                List<Integer> leftList = diffWaysToCompute(left);
                List<Integer> rightList = diffWaysToCompute(right);

                for (int a : leftList) {
                    for (int b : rightList) {

                        if (ch == '+')
                            result.add(a + b);

                        else if (ch == '-')
                            result.add(a - b);

                        else
                            result.add(a * b);
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }

        return result;
    }
}