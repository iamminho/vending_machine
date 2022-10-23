# vending_machine

## 기능 구현 설명

### Money

자판기가 현재 보유하고 있는 금액을 저장

* 현재 금액에서 구매금액을 차감시키는 기능

### Coin

자판기가 현재 보유하고 있는 동전을 저장

* 동전의 갯수를 설정하는 기능

* 동전의 갯수를 반환하는 기능

### Beverage

음료의 이름, 가격을 저장

### Beverages

Beverage들의 상태와 행위를 관리하느 클래스
각 Beverage의 수량을 저장

* Beverage의 수량을 감소시키는 기능

---

### Input

사용자로부터 받는 입력을 담당

* 자판기가 보유하고 있는 금액 입력
* 상품명과 가격, 수량 입력
* 투익 금액 입력
* 구매할 상품명 입력

### Exeption

입력시 예외처리 기능들을 담당

**숫자입력 예외처리**

* 해당: [자판기가 보유하고 있는 금액 입력시], [투입금액 입력시], [상품의 가격과 수량 입력시]
* 공통
    * 숫자로만 이루어져 있을것
    * 맨 앞의 숫자가 0이 아닐것
* [상품가격 입력시]
    * 100원부터 시작할것
    * 10원으로 나누어 떨어질것
* [자판기가 보유하고 있는 금액]
    * 10원으로 나누어 떨어질것

**문자입력 예외처리**

* 해당: [입력할 상품명, 가격, 수량 입력시], [구매할 상품며 입력시]
* 공통
    * 문자로만 이루어져 있을것
* [입력할 상품명, 가격, 수량 입력시]
    * 대괄호 안에 쉼표는 2개
    * 대괄호 안에 단어는 3개
    * 대괄호 뒤에는 세미콜론
    * 마지막 대괄호 뒤에느 세미콜론 x
* 구매할 상품명 입력시
    * 입력한 상품명에 없는 상품명만 가능 -> 상품명 중복 x

### VendingMachine

* 랜덤으로 자판기가 보유한 동전 개수 설정기능
* 상품의 가격에 대해 투입금액을 감소시키는 기능
* 투입금액이 가장 저렴한 상품의 가격보다 낮을때 잔돈 거슬러주는 기능

---

### InputView

* 자판기 보유금액 입력문구 출력
* 상품명, 가격, 수량 입력문구 출력
* 투입금액 입력문구 출력
* 구매할 상품명 입력문구 출력

### OutputView

* 자판기가 보유한 동전 출력
* 투입금액 출력
* 잔돈 출력











