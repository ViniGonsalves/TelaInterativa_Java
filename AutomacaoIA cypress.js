describe('Cenário 2 - Login', () => {
  it('passes', () => {
    cy.visit('https://automationexercise.com/')
    cy.get('.shop-menu > .nav > :nth-child(4) > a').click()
    cy.get('[data-qa="login-email"]').type('vinigonsalvessilva05@gmail.com')
    cy.get('[data-qa="login-password"]').type('vini12345')
    cy.get('[data-qa="login-button"]').click()
    cy.get('.login-form > form > p').should('contain', 'Your email or password is incorrect!')
    })
  })