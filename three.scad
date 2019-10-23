hull () {
  cylinder (h=5, r=30, center=true);
  translate ([0, 0, 10]) {
    cylinder (h=1, r=10, center=true);
  }
}
