difference () {
  cylinder (h=200, r=50, center=true);
  translate ([0, 0, 15/2]) {
    cylinder ($fn=32, h=15, r1=35, r2=15, center=true);
  }
  translate ([0, 0, -80]) {
    cylinder ($fn=32, h=160, r=35, center=true);
  }
  translate ([0, 0, -166]) {
    cylinder (h=12, r=45, center=true);
  }
}
