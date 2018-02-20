특정패턴 제외하고 사용하기
```bash
$ tail -f access.log | grep -v "healthcheck"
```