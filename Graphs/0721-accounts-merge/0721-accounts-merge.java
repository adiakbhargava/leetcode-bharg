class Solution{
    class UnionFind{
        int[] parent;
        int[] unionSize;

        UnionFind(int size){
            parent = new int[size];
            for(int i = 0; i < size; i++){
                parent[i] = i;
            }
            unionSize = new int[size];
            Arrays.fill(unionSize, 1);
        }

        void union(int x, int y){
            int representativeX = find(x);
            int representativeY = find(y);
            if(representativeX != representativeY){
                if(unionSize[representativeX] > unionSize[representativeY]){
                    parent[representativeY] = representativeX;
                    unionSize[representativeX] += unionSize[representativeY];
                } else {
                    parent[representativeX] = representativeY;
                    unionSize[representativeY] += unionSize[representativeX];
                }
            }
        }

        int find(int x){
            if(x == parent[x]){
                return x;
            }

            parent[x] = find(parent[x]);
            return parent[x];
        }
    }  

    public List<List<String>> accountsMerge(List<List<String>> accounts){
        UnionFind uf = new UnionFind(accounts.size());
        
        Map<String, Integer> emailToAccount = new HashMap<>();
        Map<Integer, String> accountToName = new HashMap<>();

        for(int i = 0; i < accounts.size(); i++){
            String name = accounts.get(i).get(0);
            accountToName.put(i, name);

            for(int j = 1; j < accounts.get(i).size(); j++){
                String email = accounts.get(i).get(j);

                if(emailToAccount.containsKey(email)){
                    uf.union(i, emailToAccount.get(email));
                } else {
                    emailToAccount.put(email, i);
                }
            }
        }

        Map<Integer, List<String>> rootToEmails = new HashMap<>();
        for(String email : emailToAccount.keySet()){
            int accountIndex = emailToAccount.get(email);
            int root = uf.find(accountIndex);

            rootToEmails.computeIfAbsent(root, k -> new ArrayList<>()).add(email);
        }

        List<List<String>> result = new ArrayList<>();
        for(int root : rootToEmails.keySet()){
            List<String> emails = rootToEmails.get(root);
            Collections.sort(emails);

            List<String> account = new ArrayList<>();
            account.add(accountToName.get(root));
            account.addAll(emails);

            result.add(account);
        }   

        return result;
    }
}