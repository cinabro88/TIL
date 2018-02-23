# 실습준비
[JSBin](jsbin.com) 을 이용해서 간단한 예제를 작성해보면서 실습을 진행. Add Library 를 통해 Vue.js 추가. 혹은 CDN을 이용해 최신버전 추가해 준다.
``` js
<script src="https://unpkg.com/vue/dist/vue.js"></script> 
```

# Hello, World
## HTML
``` html
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>JS Bin</title>
</head>
<body>
  <div id="app">
    <h1>Hello, {{name}}</h1>
  </div>
  <script src="https://unpkg.com/vue/dist/vue.js"></script>
</body>
</html>
```

## JavaScript
``` js
var app = new Vue({
  el: '#app', 
  data: {
    name: 'World'
  }
});
```

* el : 대상 element
* data : 엘리먼트에서 사용할 data

