INSERT INTO `test`.`fee_packet`(`title`, `price`, `type`, `detail`, `create_time`, `create_id`) VALUES ('标准服务套餐', 1000, 1, '<h1>描述信息</h1>', now(), 0);
INSERT INTO `test`.`fee_packet`(`title`, `price`, `type`, `detail`, `create_time`, `create_id`) VALUES ('高级服务套餐', 2000, 2, '<h1>描述信息</h1>', now(), 0);
INSERT INTO `test`.`fee_packet`(`title`, `price`, `type`, `detail`, `create_time`, `create_id`) VALUES ('钻石服务', 3000, 3, '<h1>描述信息</h1>', now(), 0);
INSERT INTO `test`.`fee_packet`(`title`, `price`, `type`, `detail`, `create_time`, `create_id`) VALUES ('上帝服务套餐', 4099, 4, '<h1>描述信息</h1>', now(), 0);


INSERT INTO `test`.`order`(`order_id`, `customer_name`, `customer_phone_no`, `appointment_time`, `customer_address`, `pet_type`, `pet_height`, `pet_length`, `pet_dead_time`, `pet_dead_reason`, `introducer`, `introducer_channel`, `introducer_take_status`, `introducer_take_money`, `fee_packet_id`, `fee_packet_title`, `total_pay_fee`, `pre_pay_fee`, `pre_order_id`, `pre_out_order_id`, `rest_pay_fee`, `rest_order_id`, `rest_out_order_id`, `status`, `create_time`, `create_id`) VALUES ('20180704225000', '大哥', '17962358974', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, 1, '基础套餐服务', 1000, 500, '2018070422500001', NULL, 500, '2018070422500002', NULL, 1, NOW(), 1);
