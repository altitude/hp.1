color ([0, 0, 1, ]) {
  translate ([0, 0, 5]) {
    union () {
      rotate (a=0.0, v=[0, 0, 1]) {
        translate ([0, 26, 0]) {
          translate ([0, 2.2, 0]) {
            cube ([5, 3.5, 5], center=true);
          }
        }
      }
      rotate (a=59.99999999999999, v=[0, 0, 1]) {
        translate ([0, 26, 0]) {
          translate ([0, 2.2, 0]) {
            cube ([5, 3.5, 5], center=true);
          }
        }
      }
      rotate (a=119.99999999999999, v=[0, 0, 1]) {
        translate ([0, 26, 0]) {
          translate ([0, 2.2, 0]) {
            cube ([5, 3.5, 5], center=true);
          }
        }
      }
      rotate (a=180.0, v=[0, 0, 1]) {
        translate ([0, 26, 0]) {
          translate ([0, 2.2, 0]) {
            cube ([5, 3.5, 5], center=true);
          }
        }
      }
      rotate (a=239.99999999999997, v=[0, 0, 1]) {
        translate ([0, 26, 0]) {
          translate ([0, 2.2, 0]) {
            cube ([5, 3.5, 5], center=true);
          }
        }
      }
      rotate (a=299.99999999999994, v=[0, 0, 1]) {
        translate ([0, 26, 0]) {
          translate ([0, 2.2, 0]) {
            cube ([5, 3.5, 5], center=true);
          }
        }
      }
      difference () {
        difference () {
          cylinder ($fn=128, h=5, r=27, center=true);
          cylinder ($fn=128, h=7, r=26, center=true);
        }
      }
    }
  }
}
