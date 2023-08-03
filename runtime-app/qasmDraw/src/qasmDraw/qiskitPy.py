from qiskit import QuantumCircuit
import matplotlib.pyplot as plt
import sys
from qiskit.qasm.exceptions import QasmError

with open('C:/Users/Riedler/Documents/Uni/SS2023/bachelor/runtime-EclipseApplication/qasmDraw/src/test.qasm', 'r') as file:
    qasm_str = file.read()

try:
    qc = QuantumCircuit.from_qasm_str(qasm_str)
    qc.draw(output='mpl')
    plt.savefig('qc.png')
    sys.exit(0)
except QasmError as e:
    sys.stderr.write(str(e))
    sys.exit(1)
