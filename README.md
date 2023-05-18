# springboot_RESTapi_practice
## 개인적으로 연습하기 위해 간단하게 만든 프로젝트입니다.

### 2023-05-18
**POSTMAN 활용하여 CRUD TEST**
* POST
- request <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/8c2fc958-319c-4066-84c3-54ae6f45c20c)
<br>
- response <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/f99c73a2-f818-4af0-8ca3-b094eea1e088)
<br>
- DB에도 잘 저장된 것을 확인.  <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/7862186a-85dc-4cf0-a392-c68359a0b077)


<br><br><br>

* GET
- 1. 모든 영화 목록을 다 가져오는 경우 <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/3fdccb1d-9f67-49c1-8faf-a309b9acbf49)
<br>
- 2. 한 개의 영화만 가져오는 경우 <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/73ada2cf-b1a8-4973-b4e3-60d48b881fd9)

<br><br><br>

* PATCH
- id : 1 값의 영화 해리포터와 불의 잔의 상영시간을 120 -> 156으로 변경 <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/ae10144c-e8bc-438a-aad2-cb5419a62bce)
<br>
response body를 보면 상영시간이 잘 바뀐 것을 확인할 수 있음
<br>

- DB에서도 잘 바뀐 것을 확인. <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/abc8df36-bace-4256-acec-e39dd176140e)

<br><br><br>

* DELETE
- id : 1 인 영화를 delete <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/045fe906-3d3a-41c6-b81f-b04067300bd8)
<br>
reponse body에 지워진 영화의 id인 1이 온 것을 확인.
<br>

- DB에서도 삭제된 것을 확인 <br>
![image](https://github.com/YYRi9/springboot_RESTapi_practice/assets/66377159/ecb1acae-24f1-486b-897d-90a1a61aa626)


