OPENQASM 2.0;
include "qelib1.inc";
qreg q[6];
cry(pi/4) q[1],q[0];
cry(3*pi/2) q[0],q[1];
crx(3*pi/4) q[1],q[0];
ry(pi/2) q[0];
cry(pi/2) q[0],q[2];
