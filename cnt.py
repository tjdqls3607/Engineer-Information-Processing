#  str에서 p가 몇 번 나오는지 세는 함수
  def cnt(str, p):  
    result = 0
    for i in range(len(str)):   

     #  str문자열에서 i부터 p의 길이까지만 슬라이싱(p와 비교하려고 같은 길이로 추출)
      sub = str[i:i+len(p)]  

       # 추출한 2개의 문자와 p의 문자가 같을 때 result +1 증가
      if sub == p:
          result += 1
  return result

str = "abdcabcabca"
p1 = "ca"
p2 = "ab"

print(f'ab{cnt(str, p1)} ca{cnt(str, p2)}')

p1(ca 3번)
abdcabcabca

p2(ab 3번)
abdcabcabca

 

print(f'ab{cnt(str, p1)} ca{cnt(str, p2)}')  하면
정답 ab3 ca3
