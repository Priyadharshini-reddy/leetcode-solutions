

class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {

        Set<String> b = new HashSet<>(Arrays.asList(bank));

        // if (startGene.equals(endGene)) return 0;
        // if (!b.contains(endGene)) return -1;

        Set<String> visited = new HashSet<>();

        Queue<String> q = new LinkedList<>();
        q.offer(startGene);
        visited.add(startGene);

        int count = 0;

        char[] choices = {'A', 'C', 'G', 'T'};

        while (!q.isEmpty()) {

            int size = q.size();

            for (int j = 0; j < size; j++) {

                String current = q.poll();

                if (current.equals(endGene)) {
                    return count;
                }

                for (int i = 0; i < 8; i++) {

                    char[] arr = current.toCharArray();

                    for (int k = 0; k < 4; k++) {

                        if (choices[k] == current.charAt(i)) {
                            continue;
                        }

                        arr[i] = choices[k];

                        String next = new String(arr);

                        if (b.contains(next) && !visited.contains(next)) {
                            visited.add(next);
                            q.offer(next);
                        }
                    }
                }
            }

            count++;
        }

        return -1;
    }
}