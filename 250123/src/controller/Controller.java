package controller;

import model.ProductDAO;
import model.ProductDTO;
import view.View;

public class Controller {
    ProductDAO model;
    View view;

    public Controller() {
        model = new ProductDAO();
        view = new View();
    }

    public void start() {
        while (true) {
        	this.view.printMenu();
        	int menuNum = this.view.inputCommand();
            int command = view.inputCommand();

            if (command == 0) {
                break;
            }
            // 1. 제품 추가
            else if (command == 1) {
                String name = view.inputName();
                int price = view.inputPrice();
                int stock = view.inputStock();

                ProductDTO dto = new ProductDTO();
                dto.setName(name);
                dto.setPrice(price);
                dto.setStock(stock);  // stock++ 제거

                boolean flag = model.insert(dto);

                if (flag) {
                    view.printTrue();
                } else {
                    view.printFalse();
                }
            }
            // 2. 전체 출력
            else if (command == 2) {
            	ProductDTO dto = new ProductDTO();  // 새로운 DTO 객체 생성
                dto.setCondition("SELECTALL");  // 필요 없는 경우 생략 가능
                view.printDatas(model.selectAll(dto)); 
            } 
            // 3. 저장된 제품 구매
            else if (command == 3) {
                int num = view.inputNum();

                ProductDTO dto = new ProductDTO();
                dto.setNum(num);

                ProductDTO data = model.selectOne(dto);
                view.printData(data);

                int count = view.inputCount();
                dto.setCount(count);  // 구매 수량 설정 추가

                boolean flag = model.update(dto);

                if (flag) {
                    view.printTrue();
                } else {
                    view.printFalse();
                }
            }
            // 4. 제품 삭제
            else if (command == 4) {
                int num = view.inputNum();
                ProductDTO dto = new ProductDTO();
                dto.setNum(num);

                boolean flag = model.delete(dto);

                if (flag) {
                    view.printTrue();
                } else {
                    view.printFalse();
                }
            }
        }
    }
}
