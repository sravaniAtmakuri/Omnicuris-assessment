INSERT INTO PRODUCT (id, name, unit_Price) VALUES
  (1, 'shirt',  100),
   (2, 'pant',   200),
     (3,  'socks',  100),
       (4, 'lipstick',  500);
       
INSERT INTO CUSTOMER (id, name, email) VALUES
  (1, 'tom', 'abc@gmail.com'),
   (2, 'russ',  'xyz@yahoo.com'),
     (3,  'joe',  'joe@gmail.com');

INSERT INTO ORDERS (id, amount, customer_id) VALUES
  (1, 1500, 3),
   (2, 400,  2),
     (3,  100,  1);     
     
INSERT INTO ORDER_DETAILS (id, price,quantity, order_id,product_id) VALUES
  (1, 500, 3, 1 , 4),
   (2, 200,  1,2,2),
     (3,  100,  2,2,3),
     (4,100,1,3,1)
     