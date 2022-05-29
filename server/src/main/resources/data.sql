delete from driver;
delete from  rider;
delete from  trip;
insert into driver (id, names, telephone, status, location, distance) values(10, "James Kalisa", "0784670500",'AVAILABLE',"Kgl","3km");
insert into driver (id, names, telephone, status, location, distance) values(11, "James Karori", "0784870500",'AVAILABLE',"Kgl","5km");
insert into driver (id, names, telephone, status, location, distance) values(12, "Mukiza Kalisa", "0784690500",'AVAILABLE',"Kgl","10km");
insert into rider (id, names, telephone, status) values(10, "James Kalisa", "0784670500",'AVAILABLE');
insert into rider (id, names, telephone, status) values(11, "James Karori", "0784870500",'AVAILABLE');
insert into rider (id, names, telephone, status) values(12, "Mukiza Kalisa", "0784690500",'AVAILABLE');