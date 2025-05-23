# 🏪 Outsourcing Platform - Store Domain

> 외주 서비스 플랫폼에서 사용자가 가게를 등록하고 운영할 수 있도록 돕는 **Store 도메인** 전반을 구현한 프로젝트입니다.  
> 가게 등록, 수정, 공지사항, 즐겨찾기, 자동 상태 변경 등 실제 배달 앱 수준의 기능 흐름을 설계하고, 단위 테스트 및 스케줄러까지 직접 작성했습니다.

---

## 🛠️ 기술 스택

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Redis
- JUnit 5 + Mockito
- Spring Scheduler

---

## 🔧 주요 구현 기능 (Store Domain)

### ✅ 1. 가게 등록 / 수정 / 삭제
- 점주 권한 사용자만 가게 생성 가능
- 중복된 상호명 및 주소에 대한 유효성 검사
- 수정/삭제 시 사용자 권한 및 상태값 검증 포함

### ✅ 2. 공지사항 관리
- 점주가 직접 공지사항 등록/수정/삭제 가능
- 가게와 연관된 공지사항 일대다 매핑
- 가게 삭제 시 공지사항 cascade 삭제 처리

### ✅ 3. 즐겨찾기 기능
- 사용자별 즐겨찾기 가게 등록/해제
- 중복 즐겨찾기 방지 로직 포함
- 전체 즐겨찾기 목록 조회 API 구현

### ✅ 4. 자동 상태 변경 (스케줄러)
- 가게가 특정 기간 이상 비활성화 상태일 경우 자동 비공개 처리
- 매일 자정에 실행되는 `@Scheduled(cron = \"0 0 0 * * *\")` 기반 자동화

### ✅ 5. 단위 테스트 및 통합 테스트
- `StoreService`, `FavoriteService`, `NoticeService`에 대한 유닛 테스트 작성
- Mock 객체를 통한 Service 단위 검증
- 상태 변화 및 예외 처리 중심 테스트 커버리지 확보


## 🧠 설계 관점에서의 의사결정

- 도메인 간 의존도를 낮추기 위해 DTO 분리 및 서비스 간 의존성 최소화
- `StoreStatus` Enum을 중심으로 가게의 공개/비공개/삭제 상태 흐름 설계
- 테스트 가능한 구조를 위해 인터페이스 기반 구현과 서비스 단위 Mocking 적용
- 도메인 행위 기반 메서드 네이밍 (`store.deactivate()`, `store.updateInfo()`)

---

## 💡 기여도

- Store CRUD + Favorite + Notice 전체 API 개발
- 스케줄러 + 상태 자동변경 로직 설계 및 구현
- StoreService 단위 테스트 100% 직접 작성

---

## 📎 기타

- 전체 시스템 인증 흐름은 팀원이 구현한 세션 기반 로그인 방식 사용
- Postman Collection 및 Swagger UI를 통한 API 검증

---



