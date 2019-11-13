color ([1, 1, 1, ]) {
  translate ([0, 0, 3]) {
    difference () {
      difference () {
        union () {
          difference () {
            hull () {
              cylinder ($fn=128, h=1, r=39, center=true);
              difference () {
                translate ([0, 0, -15]) {
                  rotate_extrude ($fn=128) {
                    translate ([22, 15, 0]) {
                      circle ($fn=128, r=15);
                    }
                  }
                }
                translate ([0, 0, -500]) {
                  cube ([1000, 1000, 1000], center=true);
                }
              }
            }
            translate ([0, 0, -1]) {
              scale ([0.95, 0.95, 0.95]) {
                hull () {
                  cylinder ($fn=128, h=1, r=39, center=true);
                  difference () {
                    translate ([0, 0, -15]) {
                      rotate_extrude ($fn=128) {
                        translate ([22, 15, 0]) {
                          circle ($fn=128, r=15);
                        }
                      }
                    }
                    translate ([0, 0, -500]) {
                      cube ([1000, 1000, 1000], center=true);
                    }
                  }
                }
              }
            }
            cylinder ($fn=128, h=100, r=24, center=true);
            translate ([0, 0, 12.7]) {
              cylinder ($fn=128, h=2, r=25.5, center=true);
            }
          }
          translate ([0, 0, -2]) {
            difference () {
              cylinder ($fn=128, h=3, r=39, center=true);
              cylinder ($fn=128, h=4, r=29.5, center=true);
              rotate (a=0.0, v=[0, 0, 1]) {
                translate ([0, 33, 0]) {
                  cylinder ($fn=16, h=4, r=1.5, center=true);
                }
              }
              rotate (a=59.99999999999999, v=[0, 0, 1]) {
                translate ([0, 33, 0]) {
                  cylinder ($fn=16, h=4, r=1.5, center=true);
                }
              }
              rotate (a=119.99999999999999, v=[0, 0, 1]) {
                translate ([0, 33, 0]) {
                  cylinder ($fn=16, h=4, r=1.5, center=true);
                }
              }
              rotate (a=180.0, v=[0, 0, 1]) {
                translate ([0, 33, 0]) {
                  cylinder ($fn=16, h=4, r=1.5, center=true);
                }
              }
              rotate (a=239.99999999999997, v=[0, 0, 1]) {
                translate ([0, 33, 0]) {
                  cylinder ($fn=16, h=4, r=1.5, center=true);
                }
              }
              rotate (a=299.99999999999994, v=[0, 0, 1]) {
                translate ([0, 33, 0]) {
                  cylinder ($fn=16, h=4, r=1.5, center=true);
                }
              }
            }
          }
        }
        translate ([0, 0, 6]) {
          rotate ([0.0,90.0,0.0]) {
            cylinder ($fn=64, h=200, r=2.6, center=true);
          }
        }
      }
    }
  }
}
