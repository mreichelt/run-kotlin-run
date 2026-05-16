import SwiftUI
import Common

struct ContentView: View {
    var body: some View {
        VStack {
            VStack(spacing: 16) {
                Image(systemName: "gearshape")
                    .font(.system(size: 200))
                    .foregroundColor(.accentColor)

                let n: Int64 = 123456791
                let isPrime = IsPrimeKt.isPrime(n: n) ? "is a prime ✅" : "is NOT a prime ❌"
                Text("\(n, format: .number.grouping(.never))\n\(isPrime)")
                    .font(.largeTitle)
                    .multilineTextAlignment(.center)
            }
            .transition(.move(edge: .top).combined(with: .opacity))
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
