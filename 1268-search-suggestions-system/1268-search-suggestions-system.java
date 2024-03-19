class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
       // 서치단어의 첫글자 이상 겹치는게 있으면 묶어서 반환
        // 완벽히 겹치는 것들끼리 묶어서 반환
      List<List<String>> result = new ArrayList<>();
       Arrays.sort(products);   
        
        for (int i = 0; i < searchWord.length(); i++) {
            List<String> suggestions = new ArrayList<>();
            
            String prefix = searchWord.substring(0, i + 1); 
            
            for (String product : products) {
                // 만약 접두사로 시작하는 product가 있다면 제안 배열에 추가
                if (product.startsWith(prefix)) {
                    suggestions.add(product);
                    if (suggestions.size() == 3) {
                        break;
                    }
                }
            }
            result.add(suggestions);
        }
        return result;
    }
   
    }
