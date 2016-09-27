--insert into sw_media
INSERT INTO sw_media (media_id, display_order, title, type, url) VALUES (1, 0, 'shirt', 'main', '/sku/0001/main_0001.jpg');
INSERT INTO sw_media (media_id, display_order, title, type, url) VALUES (2, 1, 'shirt', 'alternate', '/sku/0001/alternate_0001.jpg');
INSERT INTO sw_media (media_id, display_order, title, type, url) VALUES (3, 2, 'shirt', 'swatch', '/sku/0001/swatch_0001.jpg');

INSERT INTO sw_media (media_id, display_order, title, type, url) VALUES (4, 0, 'shirt', 'main', '/sku/0002/main_0002.jpg');
INSERT INTO sw_media (media_id, display_order, title, type, url) VALUES (5, 1, 'shirt', 'alternate', '/sku/0002/alternate_0002.jpg');
INSERT INTO sw_media (media_id, display_order, title, type, url) VALUES (6, 2, 'shirt', 'swatch', '/sku/0002/swatch_0002.jpg');

--insert into sw_variant
INSERT INTO sw_variant (variant_id, display_order, variant_name) VALUES (1, 0, 'COLOR');
INSERT INTO sw_variant (variant_id, display_order, variant_name) VALUES (2, 1, 'SIZE');

--insert into sw_variant_value
INSERT INTO sw_variant_value (variant_value_id, display_order, price_adjustment, variant_id, variant_value) VALUES (1, 0, 1, 1, 'BLUE');
INSERT INTO sw_variant_value (variant_value_id, display_order, price_adjustment, variant_id, variant_value) VALUES (2, 1, 1, 1, 'BLACK');
INSERT INTO sw_variant_value (variant_value_id, display_order, price_adjustment, variant_id, variant_value) VALUES (3, 2, 1, 1, 'RED');

--insert into sw_variant_value
INSERT INTO sw_variant_value (variant_value_id, display_order, price_adjustment, variant_id, variant_value) VALUES (4, 0, 0, 2, 'M');
INSERT INTO sw_variant_value (variant_value_id, display_order, price_adjustment, variant_id, variant_value) VALUES (5, 1, 0, 2, 'S');
INSERT INTO sw_variant_value (variant_value_id, display_order, price_adjustment, variant_id, variant_value) VALUES (6, 2, 0, 2, 'L');

--insert into sw_category
INSERT INTO sw_category (category_id, name, display_order, description) VALUES (1, 'home', 0, 'this is home category');
INSERT INTO sw_category (category_id, name, display_order, description) VALUES (2, 'feature', 0, 'this is feature category');

--insert into sw_template
INSERT INTO sw_template (template_id, name, description) VALUES (1, 'Shirt', 'this is shirt template');
INSERT INTO sw_template (template_id, name, description) VALUES (2, 'T-Shirt', 'this is T-shirt template');

--insert into sw_attribute
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (1, 'attribute1', 'String', 'this is attribute1', 0);
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (2, 'attribute2', 'String', 'this is attribute2', 1);
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (3, 'attribute3', 'double', 'this is attribute3', 2);
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (4, 'attribute4', 'int', 'this is attribute4', 3);
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (5, 'attribute5', 'date', 'this is attribute5', 4);

INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (6, 'attribute6', 'String', 'this is attribute6', 0);
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (7, 'attribute7', 'String', 'this is attribute7', 1);
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (8, 'attribute8', 'double', 'this is attribute8', 2);
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (9, 'attribute9', 'int', 'this is attribute9', 3);
INSERT INTO sw_attribute (attribute_id, name, type, description, display_order) VALUES (10, 'attribute10', 'date', 'this is attribute10', 4);

--insert into sw_attribute_value
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (1, 'attribute string value', 1);
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (2, 'attribute string value', 2);
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (3, 'attribute string value', 3);
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (4, 'attribute string value', 4);
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (5, 'attribute string value', 5);

INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (6, 'attribute string value', 6);
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (7, 'attribute string value', 7);
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (8, 'attribute string value', 8);
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (9, 'attribute string value', 9);
INSERT INTO sw_attribute_value (attribute_value_id, value, attribute_id) VALUES (10, 'attribute string value', 10);

--insert into sw_template_attribute
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (1, 1);
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (1, 2);
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (1, 3);
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (1, 4);
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (1, 5);

INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (2, 6);
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (2, 7);
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (2, 8);
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (2, 9);
INSERT INTO sw_template_attribute (template_id, attribute_id) VALUES (2, 10);

--insert into sw_feature
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (1, 'feature1', 0, 'this is feature 1');
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (2, 'feature2', 1, 'this is feature 2');
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (3, 'feature3', 2, 'this is feature 3');
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (4, 'feature4', 0, 'this is feature 4');
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (5, 'feature5', 1, 'this is feature 5');
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (6, 'feature6', 2, 'this is feature 6');
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (7, 'feature7', 0, 'this is feature 7');
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (8, 'feature8', 1, 'this is feature 8');
INSERT INTO sw_feature (feature_id, name, display_order, description) VALUES (9, 'feature9', 2, 'this is feature 9');

--insert into sw_product
INSERT INTO sw_product (product_id, brand, deleted, description, detail, display_order, displayed, manufacturer, model, name, default_sku_id)
VALUES (1, 'BBK-01', 0, 'this is a product', 0, 1, 'BBK', 'BBK-Model', 'B-Shirt', 1);
INSERT INTO sw_product (product_id, brand, deleted, description, detail, display_order, displayed, manufacturer, model, name, default_sku_id)
VALUES (2, 'BBK-02', 0, 'this is a product', 0, 1, 'BBK', 'BBK-Model', 'K-Shirt', 5);

--insert into sw_product_feature
INSERT INTO sw_product_feature (product_id, feature_id) VALUES (1, 1);
INSERT INTO sw_product_feature (product_id, feature_id) VALUES (1, 2);
INSERT INTO sw_product_feature (product_id, feature_id) VALUES (1, 3);
INSERT INTO sw_product_feature (product_id, feature_id) VALUES (1, 4);
INSERT INTO sw_product_feature (product_id, feature_id) VALUES (1, 5);

INSERT INTO sw_product_feature (product_id, feature_id) VALUES (2, 6);
INSERT INTO sw_product_feature (product_id, feature_id) VALUES (2, 7);
INSERT INTO sw_product_feature (product_id, feature_id) VALUES (2, 8);
INSERT INTO sw_product_feature (product_id, feature_id) VALUES (2, 9);

--insert into sw_product_template
INSERT INTO sw_product_template (template_id, product_id) VALUES (1, 1);
INSERT INTO sw_product_template (template_id, product_id) VALUES (2, 2);

--insert into sw_category_product
INSERT INTO sw_category_product (category_id, product_id) VALUES (1, 1);
INSERT INTO sw_category_product (category_id, product_id) VALUES (1, 2);

INSERT INTO sw_category_product (category_id, product_id) VALUES (2, 1);
INSERT INTO sw_category_product (category_id, product_id) VALUES (2, 2);



