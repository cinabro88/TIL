import FormView from '../views/FormView.js'

const tag = '[MainController]'

export default {
    init() {
        console.log(tag, 'init()')
        FormView.setup(document.querySelector('form'))
        .on('@submit', e => this.onSubmit(e.detail.input))
        .on('@reset', e => this.clearResult())
    },

    clearResult() {
        console.log(tag, 'clearResult()')  
    },

    onSubmit(input) {
        console.log(tag, 'onSubmit()', input)
    }
}