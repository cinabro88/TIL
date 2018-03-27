tcp dump를 떠서 패킷을 확인해보고 싶을대는, tcpdump 툴을 사용하면 된다.

다음은 80 포트로 들어오는 패킷을 tcp_80_eth0.dmp 라는 파일에 쓰는 예제이다.

```bash
$ yum install tcpdump
$ tcpdump -i eth0 port 80 -w tcp_80_eth0.dmp
```

생성된 파일을 wire shark 로 열어서 패킷을 분석할 수 있다.