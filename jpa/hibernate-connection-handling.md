# Hibernate Connection Handling

https://docs.jboss.org/hibernate/stable/orm/userguide/html_single/Hibernate_User_Guide.html#database-connection-handling



하이버네이트에는 커넥션을 핸들링하는 4가지 방법이 있다.

* IMMEDIATE_ACQUISITION_AND_HOLD : 세션이 연결되자 마자 커넥션을 획득 후 세션 종료때까지 유지한다.
* DELAYED_ACQUISITION_AND_HOLD : 커넥션이 필요할 때에 (사용될 때) 획득 후 세션 종료때까지 유지한다.
* DELAYED_ACQUISITION_AND_RELEASE_AFTER_STATEMENT : 커넥션이 필요할 때 획득 후, 쿼리를 수행 하고 반환 한다.
* DELAYED_ACQUISITION_AND_RELEASE_AFTER_TRANSACTION : 커녁센이 필요할 때 획득 후, 트랜잭션이 완료되면 반환된다.

설정은 `hibernate.connection.handling_mode` 값에 해주면 된다.

