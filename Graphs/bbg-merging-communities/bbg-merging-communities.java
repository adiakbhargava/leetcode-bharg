import java.util.Arrays;
class MergingCommunities{
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

        int getSize(int x){
            return unionSize[find(x)];
        }
    }

    UnionFind uf;
    public MergingCommunities(int n) {
        uf = new UnionFind(n);
    }

    public void connect(Integer x, Integer y) {
        uf.union(x, y);
    }

    public Integer getCommunitySize(Integer x) {
        return uf.getSize(x);
    }
}